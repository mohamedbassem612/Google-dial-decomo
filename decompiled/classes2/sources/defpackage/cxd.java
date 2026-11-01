package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cxd implements defpackage.czu {
    private final java.lang.String b;
    private final defpackage.czu[] c;
    private final cze d;
    private final cze e;

    public cxd(java.lang.String str, defpackage.czu[] czuVarArr) {
        this.b = str;
        this.c = czuVarArr;
        java.util.ArrayList arrayList = new java.util.ArrayList(czuVarArr.length);
        for (defpackage.czu czuVar : czuVarArr) {
            arrayList.add(czuVar.a());
        }
        cze[] czeVarArr = (cze[]) arrayList.toArray(new cze[0]);
        this.d = new defpackage.cxc((cze[]) java.util.Arrays.copyOf(czeVarArr, czeVarArr.length));
        defpackage.czu[] czuVarArr2 = this.c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(czuVarArr2.length);
        for (defpackage.czu czuVar2 : czuVarArr2) {
            arrayList2.add(czuVar2.b());
        }
        cze[] czeVarArr2 = (cze[]) arrayList2.toArray(new cze[0]);
        this.e = new defpackage.cxc((cze[]) java.util.Arrays.copyOf(czeVarArr2, czeVarArr2.length));
    }

    @Override // defpackage.czu
    public final cze a() {
        return this.d;
    }

    @Override // defpackage.czu
    public final cze b() {
        return this.e;
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
