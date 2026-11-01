package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghd {
    public static final xtq d = new xtq("RestoreProgressRepository", (byte[]) null);
    public final android.content.Context a;
    public final java.util.concurrent.atomic.AtomicReference b;
    public final aoxh c;
    private final aoxh e;

    public aghd(android.content.Context context) {
        aooh.f(context, "context");
        this.a = context;
        this.b = new java.util.concurrent.atomic.AtomicReference(null);
        aoxa aoxaVar = new aoxa(new defpackage.uke(this, (aoln) null, 20));
        this.e = aoxaVar;
        mkc mkcVar = new mkc((aoln) null, this, 7);
        int i = aoyc.a;
        this.c = new gdc(new apaa(mkcVar, aoxaVar), new defpackage.aghb(null), 9);
    }
}
