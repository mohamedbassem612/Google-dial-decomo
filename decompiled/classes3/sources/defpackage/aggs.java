package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggs {
    public final android.view.View a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final aomy e;
    public android.widget.PopupWindow f;
    public android.view.View.OnAttachStateChangeListener g;

    public aggs(android.view.View view, java.lang.String str, java.lang.String str2, java.lang.String str3, aomy aomyVar) {
        this.a = view;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = aomyVar;
    }

    public final void a() {
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.g;
        if (onAttachStateChangeListener != null) {
            this.a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.g = null;
        }
    }

    public final void b() {
        a();
        android.widget.PopupWindow popupWindow = this.f;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener(new kd(this, 7, (byte[]) null));
        }
        android.widget.PopupWindow popupWindow2 = this.f;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
    }
}
