package mehakmeet.startup.com.messagingtestamvuk.core.login;

import android.app.Activity;

/**
 * Author: MEHAKMEET
 * Created on: 17/09/2017 , 11:06 PM
 * Project: FirebaseChat TEST
 */

public interface LoginContract {
    interface View {
        void onLoginSuccess(String message);

        void onLoginFailure(String message);
    }

    interface Presenter {
        void login(Activity activity, String email, String password);
    }

    interface Interactor {
        void performFirebaseLogin(Activity activity, String email, String password);
    }

    interface OnLoginListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}
