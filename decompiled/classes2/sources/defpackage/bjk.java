package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjk {
    public static final defpackage.bjk a = new defpackage.bjk(null, null, null);
    public final cxi b;
    public final dkw c;
    public final bek d;

    public bjk(cxi cxiVar, dkw dkwVar, bek bekVar) {
        this.b = cxiVar;
        this.c = dkwVar;
        this.d = bekVar;
    }

    public static /* synthetic */ defpackage.bjk a(defpackage.bjk bjkVar, cxi cxiVar, dkw dkwVar, bek bekVar, int i) {
        if ((i & 1) != 0) {
            cxiVar = bjkVar.b;
        }
        if ((i & 2) != 0) {
            dkwVar = bjkVar.c;
        }
        if ((i & 4) != 0) {
            bekVar = bjkVar.d;
        }
        return new defpackage.bjk(cxiVar, dkwVar, bekVar);
    }
}
