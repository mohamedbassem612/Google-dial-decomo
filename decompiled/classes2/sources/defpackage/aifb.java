package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aifb extends defpackage.aiff {
    final /* synthetic */ defpackage.aifg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aifb(defpackage.aifg aifgVar) {
        super(aifgVar);
        j$.util.Objects.requireNonNull(aifgVar);
        this.a = aifgVar;
    }

    @Override // defpackage.aiff
    public final /* bridge */ /* synthetic */ java.lang.Object a(int i) {
        return new defpackage.aifa(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        defpackage.aifg aifgVar = this.a;
        int iA = aifgVar.a(key);
        return iA != -1 && j$.util.Objects.equals(value, aifgVar.b[iA]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int iBz = ahvr.bz(key);
            defpackage.aifg aifgVar = this.a;
            int iB = aifgVar.b(key, iBz);
            if (iB != -1 && j$.util.Objects.equals(value, aifgVar.b[iB])) {
                aifgVar.e(iB, iBz);
                return true;
            }
        }
        return false;
    }
}
