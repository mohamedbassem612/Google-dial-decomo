package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agqn implements java.io.FilenameFilter {
    public final /* synthetic */ aihd a;
    public final /* synthetic */ aihd b;

    public /* synthetic */ agqn(aihd aihdVar, aihd aihdVar2) {
        this.a = aihdVar;
        this.b = aihdVar2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        java.io.File file2 = new java.io.File(file, str);
        try {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(str);
            if (numValueOf.intValue() < 0) {
                return false;
            }
            aihd aihdVar = this.a;
            if (aihdVar != null && aihdVar.contains(numValueOf)) {
                return false;
            }
            aihd aihdVar2 = this.b;
            return (aihdVar2 == null || aihdVar2.contains(numValueOf)) && file2.isDirectory() && file2.canWrite();
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }
}
