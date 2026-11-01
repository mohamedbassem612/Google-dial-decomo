package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aifc extends defpackage.aiff {
    final /* synthetic */ defpackage.aifg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aifc(defpackage.aifg aifgVar) {
        super(aifgVar);
        j$.util.Objects.requireNonNull(aifgVar);
        this.a = aifgVar;
    }

    @Override // defpackage.aiff
    public final java.lang.Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int iBz = ahvr.bz(obj);
        defpackage.aifg aifgVar = this.a;
        int iB = aifgVar.b(obj, iBz);
        if (iB == -1) {
            return false;
        }
        aifgVar.e(iB, iBz);
        return true;
    }
}
