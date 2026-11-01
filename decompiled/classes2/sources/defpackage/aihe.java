package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aihe extends defpackage.aigq {
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    public final defpackage.aihg a() {
        aihd aihdVarX;
        aieb aiebVar = this.a;
        if (aiebVar == null) {
            return defpackage.aieo.a;
        }
        aify<java.util.Map.Entry> aidwVar = new aidw(aiebVar);
        java.util.Comparator comparator = this.b;
        if (comparator != null) {
            aidwVar = aify.x(aijz.d(comparator).e(), aidwVar);
        }
        java.util.Comparator comparator2 = this.c;
        if (aidwVar.isEmpty()) {
            return defpackage.aieo.a;
        }
        aigb aigbVar = new aigb(aidwVar.size());
        int size = 0;
        for (java.util.Map.Entry entry : aidwVar) {
            java.lang.Object key = entry.getKey();
            aihd aihdVarH = ((aihb) entry.getValue()).h();
            if (comparator2 == null) {
                aihdVarX = aihd.o(aihdVarH);
            } else if (defpackage.airh.e(comparator2, aihdVarH) && (aihdVarH instanceof aiho)) {
                aihd aihdVar = (aiho) aihdVarH;
                if (aihdVar.l()) {
                    java.lang.Object[] objArrBr = ahvr.br(aihdVarH);
                    aihdVarX = aiho.x(comparator2, objArrBr.length, objArrBr);
                } else {
                    aihdVarX = aihdVar;
                }
            } else {
                java.lang.Object[] objArrBr2 = ahvr.br(aihdVarH);
                aihdVarX = aiho.x(comparator2, objArrBr2.length, objArrBr2);
            }
            if (!aihdVarX.isEmpty()) {
                aigbVar.i(key, aihdVarX);
                size += aihdVarX.size();
            }
        }
        return new defpackage.aihg(aigbVar.e(true), size, comparator2);
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        super.g(obj, obj2);
    }

    public final void c(java.lang.Object obj, java.lang.Iterable iterable) {
        super.h(obj, iterable);
    }

    @Override // defpackage.aigq
    public final aifn e(int i) {
        java.util.Comparator comparator = this.c;
        return comparator == null ? aihd.i(i) : new aihm(comparator, i);
    }

    @Override // defpackage.aigq
    public final int i(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Set) {
            return java.lang.Math.max(4, ((java.util.Set) iterable).size());
        }
        return 4;
    }
}
