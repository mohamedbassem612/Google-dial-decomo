package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jyu implements defpackage.kio {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/clearmissedcalls/MissedCallCancellationController");
    public final defpackage.aoss b;
    public final defpackage.zjs c;
    public java.lang.Boolean d;
    public final defpackage.ahda e;

    public jyu(defpackage.aoss aossVar, defpackage.zjs zjsVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (zjsVar == null) {
            defpackage.aooh.i("dialerTelecom");
        }
        this.b = aossVar;
        this.c = zjsVar;
        this.e = new defpackage.ahda((byte[]) null);
    }

    private final java.lang.Object a(defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        java.lang.Object objA = defpackage.ahvr.ag(this.b, this.e, new jlk(aonjVar, (defpackage.aoln) null, 16, (byte[]) null)).a(aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }

    @Override // defpackage.kio
    public final java.lang.Object n(defpackage.aoln aolnVar) {
        java.lang.Object objA = a(new jgn(this, (defpackage.aoln) null, 2), aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }

    @Override // defpackage.kio
    public final java.lang.Object o(defpackage.aoln aolnVar) {
        java.lang.Object objA = a(new jgn(this, (defpackage.aoln) null, 3, (byte[]) null), aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }
}
