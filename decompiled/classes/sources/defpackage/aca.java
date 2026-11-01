package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aca extends defpackage.aec implements java.util.Map, j$.util.Map {
    defpackage.abu a;
    defpackage.abw b;
    defpackage.aby c;

    public aca(defpackage.aec aecVar) {
        super(0);
        if (aecVar != null) {
            i(aecVar);
        }
    }

    public final boolean a(java.util.Collection collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(d(i2))) {
                e(i2);
            }
        }
        return i != this.d;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        defpackage.abu abuVar = this.a;
        if (abuVar != null) {
            return abuVar;
        }
        defpackage.abu abuVar2 = new defpackage.abu(this);
        this.a = abuVar2;
        return abuVar2;
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        defpackage.abw abwVar = this.b;
        if (abwVar != null) {
            return abwVar;
        }
        defpackage.abw abwVar2 = new defpackage.abw(this);
        this.b = abwVar2;
        return abwVar2;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        h(this.d + map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.-CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        defpackage.aby abyVar = this.c;
        if (abyVar != null) {
            return abyVar;
        }
        defpackage.aby abyVar2 = new defpackage.aby(this);
        this.c = abyVar2;
        return abyVar2;
    }

    public aca() {
        super(0);
    }
}
