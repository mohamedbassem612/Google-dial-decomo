package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adnt extends java.lang.Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public adnt(java.lang.Iterable iterable) {
        defpackage.adnv[] adnvVarArr = (defpackage.adnv[]) defpackage.ahvr.bs(iterable, defpackage.adnv.class);
        this("Unable to retrieve files: ".concat(new defpackage.ahyj(", ").b(java.util.Arrays.asList(adnvVarArr))), null, adnvVarArr);
    }

    public adnt(java.lang.String str, java.lang.Throwable th, defpackage.adnv... adnvVarArr) {
        super(str, th);
        defpackage.aify.o(adnvVarArr);
    }
}
