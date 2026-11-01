package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rcr {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public rcr(defpackage.rcp rcpVar, ucm ucmVar, zpm zpmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(zpmVar, "callScopes");
        this.a = rcpVar;
        this.b = ucmVar;
        this.c = zpmVar;
    }

    public static final boolean d(android.content.Context context, int i) {
        int iA = uyb.a(context);
        return (iA & 1) != 0 && (iA & 2) == 2 && (i & 1) == 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aonj, java.lang.Object] */
    public final j$.util.Optional a() {
        j$.util.Optional optionalH = ((zpm) this.c).h();
        defpackage.qkv qkvVar = new defpackage.qkv(new qks(13), 13);
        if (true != optionalH.isPresent()) {
            return optionalH;
        }
        return j$.util.Optional.ofNullable(qkvVar.a.a(optionalH.get()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aonj, java.lang.Object] */
    public final j$.util.Optional b() {
        j$.util.Optional optionalA = a();
        defpackage.qkv qkvVar = new defpackage.qkv(new qks(11), 12);
        if (true != optionalA.isPresent()) {
            return optionalA;
        }
        return j$.util.Optional.ofNullable(qkvVar.a.a(optionalA.get()));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, nwu] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aoin, java.lang.Object] */
    public final defpackage.tjq c(android.app.Activity activity, final defpackage.tkd tkdVar, int i, final java.lang.String str, final int i2, final boolean z, boolean z2) {
        if (d(activity, i)) {
            return new defpackage.tjq(2, new defpackage.tjh() { // from class: tje
                @Override // defpackage.tjh
                public final void a() {
                    tkdVar.q(str, i2, z);
                }
            });
        }
        if (!((java.lang.Boolean) this.c.a()).booleanValue()) {
            z2 = this.b.l();
        }
        if (z2) {
            return new defpackage.tjq(1, new defpackage.tjh() { // from class: tjf
                @Override // defpackage.tjh
                public final void a() {
                    tkdVar.p(str, i2);
                }
            });
        }
        return null;
    }

    public final java.lang.Object e(defpackage.zdt zdtVar, boolean z, aoln aolnVar) {
        defpackage.zff zffVar = (defpackage.zff) this.a;
        return ((defpackage.abtr) this.c).j((defpackage.zfd) this.b, zffVar, zdtVar, z, aolnVar);
    }

    public rcr(aogc aogcVar, kaw kawVar, ajct ajctVar) {
        this.a = aogcVar;
        this.c = kawVar;
        this.b = ajctVar;
    }

    public rcr(nwu nwuVar, rlv rlvVar, aoin aoinVar) {
        this.b = nwuVar;
        this.a = rlvVar;
        this.c = aoinVar;
    }

    public rcr(defpackage.abtr abtrVar, defpackage.zff zffVar, defpackage.zfd zfdVar) {
        this.c = abtrVar;
        this.a = zffVar;
        this.b = zfdVar;
    }
}
