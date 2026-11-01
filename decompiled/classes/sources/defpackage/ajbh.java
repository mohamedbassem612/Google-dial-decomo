package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbh extends defpackage.ajaq {
    private java.util.List c;

    public ajbh(defpackage.aifo aifoVar, boolean z) {
        java.util.List arrayList;
        super(aifoVar, z, true);
        if (aifoVar.isEmpty()) {
            arrayList = java.util.Collections.EMPTY_LIST;
        } else {
            int size = aifoVar.size();
            defpackage.ahvr.bC(size, "initialArraySize");
            arrayList = new java.util.ArrayList(size);
        }
        for (int i = 0; i < aifoVar.size(); i++) {
            arrayList.add(null);
        }
        this.c = arrayList;
        u();
    }

    @Override // defpackage.ajaq
    public final void e(int i, java.lang.Object obj) {
        java.util.List list = this.c;
        if (list != null) {
            list.set(i, new defpackage.ajyk(obj));
        }
    }

    @Override // defpackage.ajaq
    public final void g() {
        java.util.List<defpackage.ajyk> list = this.c;
        if (list != null) {
            int size = list.size();
            defpackage.ahvr.bC(size, "initialArraySize");
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (defpackage.ajyk ajykVar : list) {
                arrayList.add(ajykVar != null ? ajykVar.b : null);
            }
            o(j$.util.DesugarCollections.unmodifiableList(arrayList));
        }
    }

    @Override // defpackage.ajaq
    public final void w(int i) {
        super.w(i);
        this.c = null;
    }
}
