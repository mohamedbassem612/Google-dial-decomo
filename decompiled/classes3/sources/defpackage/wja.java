package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wja implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.wjb a;
    final /* synthetic */ amgo b;
    final /* synthetic */ long c;

    public wja(defpackage.wjb wjbVar, amgo amgoVar, long j, int i) {
        this.$cid = i;
        this.a = wjbVar;
        this.b = amgoVar;
        this.c = j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() throws aois {
        int i;
        int i2 = this.$cid;
        amgo amgoVar = this.b;
        int i3 = 2;
        if (i2 != 0) {
            int iOrdinal = defpackage.amgn.a(amgoVar.b).ordinal();
            if (iOrdinal == 0) {
                i = 5;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new aois();
                    }
                    throw new java.lang.IllegalStateException("invalid TranscriptionModeUpdate");
                }
                i = 4;
            }
            this.a.d(i, defpackage.wjb.c(amgoVar), this.c);
        } else {
            int iOrdinal2 = defpackage.amgn.a(amgoVar.b).ordinal();
            if (iOrdinal2 == 0) {
                i3 = 3;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new aois();
                }
                throw new java.lang.IllegalStateException("invalid TranscriptionModeUpdate");
            }
            this.a.d(i3, defpackage.wjb.c(amgoVar), this.c);
        }
        return null;
    }
}
