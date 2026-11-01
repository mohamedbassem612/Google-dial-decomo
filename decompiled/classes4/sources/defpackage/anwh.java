package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anwh extends defpackage.anwe {
    final /* synthetic */ defpackage.anwk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwh(defpackage.anwl anwlVar, defpackage.anwk anwkVar) {
        super(anwlVar.c);
        this.a = anwkVar;
        j$.util.Objects.requireNonNull(anwlVar);
    }

    @Override // defpackage.anwe
    public final void a() {
        java.util.List list;
        java.util.List arrayList = new java.util.ArrayList();
        while (true) {
            defpackage.anwk anwkVar = this.a;
            synchronized (anwkVar) {
                if (anwkVar.c.isEmpty()) {
                    anwkVar.c = null;
                    anwkVar.a = true;
                    return;
                } else {
                    list = anwkVar.c;
                    anwkVar.c = arrayList;
                }
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
