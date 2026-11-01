package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggg {
    private final android.content.Context d;
    private java.lang.String e = "";
    public android.view.View.OnClickListener a = null;
    public int b = 0;
    public int c = 0;
    private java.lang.String f = "";

    public aggg(android.content.Context context) {
        this.d = context;
    }

    public final defpackage.aggh a() {
        return new defpackage.aggh(this.e, this.a, this.b, this.c, this.f);
    }

    public final void b(int i) {
        android.content.Context context = this.d;
        this.f = context.getResources() != null ? context.getResources().getResourceEntryName(i) : "";
        this.e = context.getString(i);
    }
}
