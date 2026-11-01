package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aifz extends defpackage.aigq {
    public final defpackage.aiga a() {
        aify aifyVarI;
        aieb aiebVar = this.a;
        if (aiebVar == null) {
            return defpackage.aien.a;
        }
        aify<java.util.Map.Entry> aidwVar = new aidw(aiebVar);
        java.util.Comparator comparator = this.b;
        if (comparator != null) {
            aidwVar = aify.x(aijz.d(comparator).e(), aidwVar);
        }
        java.util.Comparator comparator2 = this.c;
        if (aidwVar.isEmpty()) {
            return defpackage.aien.a;
        }
        aigb aigbVar = new aigb(aidwVar.size());
        int i = 0;
        for (java.util.Map.Entry entry : aidwVar) {
            java.lang.Object key = entry.getKey();
            aift aiftVar = (aift) entry.getValue();
            if (comparator2 == null) {
                aifyVarI = aiftVar.h();
            } else {
                aiftVar.c = true;
                java.util.Arrays.sort(aiftVar.a, 0, aiftVar.b, comparator2);
                aifyVarI = aify.i(aiftVar.a, aiftVar.b);
            }
            aigbVar.i(key, aifyVarI);
            i += ((aike) aifyVarI).d;
        }
        return new defpackage.aiga(aigbVar.e(true), i);
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        super.g(obj, obj2);
    }

    public final void c(aije aijeVar) {
        for (java.util.Map.Entry entry : aijeVar.o().entrySet()) {
            h(entry.getKey(), (java.lang.Iterable) entry.getValue());
        }
    }

    public final void d(java.lang.Object obj, java.lang.Iterable iterable) {
        super.h(obj, iterable);
    }
}
