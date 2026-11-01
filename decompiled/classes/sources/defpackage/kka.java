package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kka {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final defpackage.ojo d;
    public final defpackage.aoin e;
    public final defpackage.kaw f;
    public final defpackage.zjm g;
    public final defpackage.rsr h;
    private final defpackage.aoin i;

    public kka(android.content.Context context, defpackage.ajct ajctVar, defpackage.rsr rsrVar, defpackage.kaw kawVar, defpackage.ojo ojoVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.zjm zjmVar) {
        this.b = context;
        this.c = ajctVar;
        this.h = rsrVar;
        this.f = kawVar;
        this.d = ojoVar;
        this.i = aoinVar;
        this.e = aoinVar2;
        this.g = zjmVar;
    }

    public final android.net.Uri a() {
        return ((java.lang.Boolean) this.i.a()).booleanValue() ? android.provider.CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("include_voip_calls", "true").build() : android.provider.CallLog.Calls.CONTENT_URI;
    }
}
