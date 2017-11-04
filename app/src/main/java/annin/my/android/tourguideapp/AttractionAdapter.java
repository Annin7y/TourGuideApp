package annin.my.android.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Maino96-10022 on 11/3/2016.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int mColorResourceId;

    public AttractionAdapter(Activity context, ArrayList<Attraction> words, int ColorResourceId) {
        super(context, 0, words);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //first get the list item view you can use
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Attraction currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentAttraction.getNameId());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentAttraction.getDescriptionId());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentAttraction.getAddressId());

        TextView emailTextView = (TextView) listItemView.findViewById(R.id.email_text_view);
        emailTextView.setText(currentAttraction.getEmailId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAttraction.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

// Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;


    }

}
