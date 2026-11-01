package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cii extends aoju implements j$.util.Set, chl {
    private final /* synthetic */ int $cid;
    private final cic a;

    public cii(cic cicVar, int i) {
        this.$cid = i;
        this.a = cicVar;
    }

    public final int a() {
        int i = this.$cid;
        return this.a.b();
    }

    public final boolean contains(java.lang.Object obj) {
        if (this.$cid == 0) {
            return this.a.containsKey(obj);
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!(entry instanceof java.util.Map.Entry)) {
            return false;
        }
        cic cicVar = this.a;
        java.lang.Object obj2 = cicVar.get(entry.getKey());
        if (obj2 != null) {
            return aooh.n(obj2, entry.getValue());
        }
        return entry.getValue() == null && cicVar.containsKey(entry.getKey());
    }

    public final java.util.Iterator iterator() {
        defpackage.cid cidVar;
        int i = 0;
        if (this.$cid != 0) {
            defpackage.cim[] cimVarArr = new defpackage.cim[8];
            while (i < 8) {
                cimVarArr[i] = new defpackage.cin();
                i++;
            }
            cidVar = new defpackage.cid(this.a.b, cimVarArr);
        } else {
            defpackage.cim[] cimVarArr2 = new defpackage.cim[8];
            while (i < 8) {
                cimVarArr2[i] = new defpackage.cio();
                i++;
            }
            cidVar = new defpackage.cid(this.a.b, cimVarArr2);
        }
        return cidVar;
    }
}
