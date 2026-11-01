package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aikl implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.lang.Object[] a;
    final int[] b;

    public aikl(aijo aijoVar) {
        aigy aigyVar = (aigy) aijoVar;
        int size = aigyVar.o().size();
        this.a = new java.lang.Object[size];
        this.b = new int[size];
        int i = 0;
        for (defpackage.aijp aijpVar : aigyVar.o()) {
            this.a[i] = aijpVar.a;
            this.b[i] = aijpVar.a();
            i++;
        }
    }

    java.lang.Object readResolve() {
        java.lang.Object[] objArr = this.a;
        aigv aigvVar = new aigv(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            aigvVar.d(objArr[i], this.b[i]);
        }
        return aigvVar.a();
    }
}
