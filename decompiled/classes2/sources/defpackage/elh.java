package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elh implements aonj {
    private final int a;
    private android.support.v4.app.FragmentContainerView b;

    public elh(int i) {
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        android.support.v4.app.FragmentContainerView fragmentContainerView = new android.support.v4.app.FragmentContainerView((android.content.Context) obj);
        fragmentContainerView.setId(this.a);
        this.b = fragmentContainerView;
        return fragmentContainerView;
    }

    public final android.support.v4.app.FragmentContainerView b() {
        android.support.v4.app.FragmentContainerView fragmentContainerView = this.b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new java.lang.IllegalStateException("AndroidView has not created a container for " + this.a + " yet");
    }
}
