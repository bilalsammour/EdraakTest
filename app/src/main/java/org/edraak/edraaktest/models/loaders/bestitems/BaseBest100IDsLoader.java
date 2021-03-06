package org.edraak.edraaktest.models.loaders.bestitems;

import android.content.Context;

import org.edraak.edraaktest.models.managers.BestItemsManagers;
import org.edraak.edraaktest.models.thin.CourseModel;

import java.util.List;

/**
 * Best 100 courses based on their IDs
 */
public class BaseBest100IDsLoader extends BaseBestItemsLoader {

    /**
     * Create an instance
     *
     * @param context a context of the application package implementing
     *                this class.
     */
    public BaseBest100IDsLoader(Context context) {
        super(context);
    }

    @Override
    protected List<CourseModel> getBestItemsList(BestItemsManagers bestItemsManagers) {
        return bestItemsManagers.getBest100CoursesBasedOnId();
    }
}
