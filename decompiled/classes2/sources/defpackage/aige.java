package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class aige implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public aige(aigf aigfVar) {
        java.lang.Object[] objArr = new java.lang.Object[aigfVar.size()];
        java.lang.Object[] objArr2 = new java.lang.Object[aigfVar.size()];
        ailj ailjVarK = aigfVar.e().k();
        int i = 0;
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public aigb a(int i) {
        return new aigb(i);
    }

    final java.lang.Object readResolve() {
        java.lang.Object obj = this.a;
        boolean z = obj instanceof aihd;
        java.lang.Object obj2 = this.b;
        if (z) {
            aihd aihdVar = (aihd) obj;
            aigb aigbVarA = a(aihdVar.size());
            ailj ailjVarK = aihdVar.k();
            ailj ailjVarK2 = ((aifo) obj2).k();
            while (ailjVarK.hasNext()) {
                aigbVarA.i(ailjVarK.next(), ailjVarK2.next());
            }
            return aigbVarA.c();
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        aigb aigbVarA2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            aigbVarA2.i(objArr[i], ((java.lang.Object[]) obj2)[i]);
        }
        return aigbVarA2.c();
    }
}
