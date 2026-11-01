package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwu implements tel {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.tem a;
    private final tek b;
    private final aopu c;

    public lwu(defpackage.tem temVar, aopu aopuVar, int i) {
        this.$cid = i;
        this.a = temVar;
        this.b = temVar.a();
        this.c = aopuVar;
    }

    public final tek a() {
        int i = this.$cid;
        if (i == 0 || i != 1) {
        }
        return this.b;
    }

    public final aopu b() {
        int i = this.$cid;
        if (i == 0 || i != 1) {
        }
        return this.c;
    }

    public final aoxh c(tei teiVar) {
        int i = this.$cid;
        if (i == 0) {
            return this.a.c(teiVar);
        }
        if (i == 1) {
            return this.a.c(teiVar);
        }
        if (i == 2) {
            return this.a.c(teiVar);
        }
        defpackage.tem temVar = this.a;
        return i != 3 ? temVar.c(teiVar) : temVar.c(teiVar);
    }

    public lwu(defpackage.tem temVar, aopu aopuVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = temVar;
        this.b = ((defpackage.kkn) temVar).a;
        this.c = aopuVar;
    }

    public lwu(defpackage.tem temVar, aopu aopuVar, int i, char[] cArr) {
        this.$cid = i;
        this.a = temVar;
        this.b = ((defpackage.lwo) temVar).d;
        this.c = aopuVar;
    }

    public lwu(defpackage.tem temVar, aopu aopuVar, int i, int[] iArr) {
        this.$cid = i;
        this.a = temVar;
        this.b = ((utl) temVar).b;
        this.c = aopuVar;
    }

    public lwu(defpackage.tem temVar, aopu aopuVar, int i, short[] sArr) {
        this.$cid = i;
        this.a = temVar;
        this.b = ((defpackage.lxh) temVar).c;
        this.c = aopuVar;
    }
}
