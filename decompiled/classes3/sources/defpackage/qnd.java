package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnd {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/answer/service/VideoAnswerController");
    public final defpackage.qax f;
    public final ajcu g;
    public final defpackage.ptx l;
    public final defpackage.pqm m;
    public final defpackage.pvr n;
    public final defpackage.qbe o;
    public final zpz p;
    public final defpackage.wjc q;
    final defpackage.znv b = new ooa(this, 7);
    final znu c = new defpackage.qdi(this, 2);
    final defpackage.puv d = new defpackage.qna(this, 2);
    final olu e = new defpackage.ozv(this, 3);
    public final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final java.util.concurrent.atomic.AtomicReference j = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final java.util.concurrent.atomic.AtomicBoolean k = new java.util.concurrent.atomic.AtomicBoolean(false);

    public qnd(defpackage.ptx ptxVar, defpackage.pqm pqmVar, defpackage.wjc wjcVar, defpackage.pvr pvrVar, defpackage.qbe qbeVar, defpackage.qax qaxVar, zpz zpzVar, ajcu ajcuVar) {
        this.l = ptxVar;
        this.m = pqmVar;
        this.q = wjcVar;
        this.n = pvrVar;
        this.o = qbeVar;
        this.f = qaxVar;
        this.p = zpzVar;
        this.g = ajcuVar;
    }

    public final void a(defpackage.zcy zcyVar) {
        int iOrdinal = zcyVar.ordinal();
        if (iOrdinal == 0) {
            this.o.a(qbc.bz);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                this.o.a(qbc.by);
                return;
            } else if (iOrdinal != 3) {
                return;
            }
        }
        this.o.a(qbc.bx);
    }

    public final void b(defpackage.zcy zcyVar) {
        defpackage.zcy zcyVar2 = defpackage.zcy.a;
        int iOrdinal = zcyVar.ordinal();
        if (iOrdinal == 0) {
            this.o.a(qbc.bD);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                this.o.a(qbc.bC);
                return;
            } else if (iOrdinal != 3) {
                return;
            }
        }
        this.o.a(qbc.bB);
    }
}
