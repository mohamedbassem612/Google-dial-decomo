package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wes extends android.util.FloatProperty {
    public wes() {
        super("Logo Width");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Float get(java.lang.Object obj) {
        int i = com.android.dialer.widget.logoview.LogoView.d;
        return java.lang.Float.valueOf(((com.android.dialer.widget.logoview.LogoView) obj).a.i);
    }

    @Override // android.util.FloatProperty
    public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj, float f) {
        com.android.dialer.widget.logoview.LogoView logoView = (com.android.dialer.widget.logoview.LogoView) obj;
        int i = com.android.dialer.widget.logoview.LogoView.d;
        logoView.b(f, logoView.a.j);
    }
}
