package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aifd extends defpackage.aiff {
    final /* synthetic */ defpackage.aifg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aifd(defpackage.aifg aifgVar) {
        super(aifgVar);
        j$.util.Objects.requireNonNull(aifgVar);
        this.a = aifgVar;
    }

    @Override // defpackage.aiff
    public final java.lang.Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int iBz = ahvr.bz(obj);
        defpackage.aifg aifgVar = this.a;
        int iC = aifgVar.c(obj, iBz);
        if (iC == -1) {
            return false;
        }
        aifgVar.d(iC, ahvr.bz(aifgVar.a[iC]), iBz);
        return true;
    }
}
