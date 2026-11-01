package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorb extends defpackage.aojo {
    final /* synthetic */ defpackage.aord a;

    public aorb(defpackage.aord aordVar) {
        this.a = aordVar;
    }

    @Override // defpackage.aojj
    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    @Override // defpackage.aojj, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.contains((java.lang.String) obj);
        }
        return false;
    }

    @Override // defpackage.aojo, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        java.lang.String strGroup = this.a.a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // defpackage.aojo, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.indexOf((java.lang.String) obj);
        }
        return -1;
    }

    @Override // defpackage.aojo, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.lastIndexOf((java.lang.String) obj);
        }
        return -1;
    }
}
