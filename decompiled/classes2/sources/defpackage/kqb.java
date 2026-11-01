package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kqb {
    public final aoyq a;
    public final apdp b;

    public /* synthetic */ kqb(byte[] bArr) {
        apdp apdpVar = new apdp();
        aoyq aoyqVarC = aoyx.c(1, 0, 0, 6);
        this.b = apdpVar;
        this.a = aoyqVarC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aomy aomyVar, aoln aolnVar) {
        defpackage.kqa kqaVar;
        if (aolnVar instanceof defpackage.kqa) {
            kqaVar = (defpackage.kqa) aolnVar;
            int i = kqaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqaVar.c = i - Integer.MIN_VALUE;
            } else {
                kqaVar = new defpackage.kqa(this, aolnVar);
            }
        } else {
            kqaVar = new defpackage.kqa(this, aolnVar);
        }
        java.lang.Object objAv = kqaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kqaVar.c;
        if (i2 == 0) {
            aooc.af(objAv);
            aoyq aoyqVar = this.a;
            aoyqVar.fN();
            aomyVar.a();
            ipv ipvVar = new ipv((aoln) null, 13, (byte[][][]) null);
            kqaVar.c = 1;
            objAv = aoov.av(aoyqVar, ipvVar, kqaVar);
            if (objAv == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAv);
        }
        defpackage.kpz kpzVar = (defpackage.kpz) objAv;
        j$.util.Objects.checkIndex(0, 3);
        if (kpzVar != null) {
            if (kpzVar instanceof defpackage.kpx) {
                return aojh.a;
            }
            if (kpzVar instanceof defpackage.kpy) {
                return aooc.ae(((defpackage.kpy) kpzVar).a);
            }
        }
        throw new aois();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kqb) {
            defpackage.kqb kqbVar = (defpackage.kqb) obj;
            if (aooh.n(this.b, kqbVar.b) && aooh.n(this.a, kqbVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DownloadState(mutex=" + this.b + ", eventFlow=" + this.a + ')';
    }

    public kqb() {
        this(null);
    }
}
