package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mbr implements defpackage.zbp {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/cui/impl/DialerGilObserver");
    public final j$.util.Optional b;
    public final defpackage.acxg c;
    private final defpackage.aoss d;

    public mbr(defpackage.aoss aossVar, defpackage.acxg acxgVar, j$.util.Optional optional) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (acxgVar == null) {
            defpackage.aooh.i("semanticLogger");
        }
        if (optional == null) {
            defpackage.aooh.i("cuiMetadataFactory");
        }
        this.d = aossVar;
        this.c = acxgVar;
        this.b = optional;
    }

    @Override // defpackage.zbp
    public final void a(defpackage.zbo zboVar) {
        if (zboVar instanceof defpackage.zbu) {
            defpackage.aoov.an(this.d, null, 0, new defpackage.mbq(zboVar, this, (defpackage.aoln) null, 0), 3);
        }
    }
}
