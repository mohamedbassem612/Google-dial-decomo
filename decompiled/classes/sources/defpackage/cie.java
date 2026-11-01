package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cie extends defpackage.aojs implements j$.util.Map, defpackage.chn {
    public defpackage.cil a;
    public java.lang.Object b;
    public int c;
    public int d;
    public defpackage.cfd e = new defpackage.cfd();
    private defpackage.cic f;

    public cie(defpackage.cic cicVar) {
        this.f = cicVar;
        defpackage.cic cicVar2 = this.f;
        this.a = cicVar2.b;
        this.d = cicVar2.b();
    }

    @Override // defpackage.aojs
    public final int b() {
        return this.d;
    }

    @Override // defpackage.chn
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public defpackage.cic a() {
        defpackage.cil cilVar = this.a;
        defpackage.cic cicVar = this.f;
        if (cilVar != cicVar.b) {
            this.e = new defpackage.cfd();
            cicVar = new defpackage.cic(cilVar, b());
        }
        this.f = cicVar;
        return cicVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a = defpackage.cil.a;
        g(0);
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.a.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.aojs
    public final java.util.Collection d() {
        return new cih(this);
    }

    @Override // defpackage.aojs
    public final java.util.Set e() {
        return new chz(this);
    }

    @Override // defpackage.aojs
    public final java.util.Set f() {
        return new cig(this);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    public final void g(int i) {
        this.d = i;
        this.c++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.a.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.b = null;
        this.a = this.a.e(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        defpackage.cic cicVarA = map instanceof defpackage.cic ? (defpackage.cic) map : null;
        if (cicVarA == null) {
            defpackage.cie cieVar = map instanceof defpackage.cie ? (defpackage.cie) map : null;
            cicVarA = cieVar != null ? cieVar.a() : null;
        }
        if (cicVarA == null) {
            super.putAll(map);
            return;
        }
        defpackage.cit citVar = new defpackage.cit(null);
        int iB = b();
        defpackage.cil cilVar = this.a;
        defpackage.cil cilVar2 = cicVarA.b;
        if (cilVar2 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.a = cilVar.f(cilVar2, 0, citVar, this);
        int iB2 = (cicVarA.b() + iB) - citVar.a;
        if (iB != iB2) {
            g(iB2);
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int iB = b();
        defpackage.cil cilVarH = this.a.h(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (cilVarH == null) {
            cilVarH = defpackage.cil.a;
        }
        this.a = cilVarH;
        return iB != b();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.-CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        this.b = null;
        defpackage.cil cilVarG = this.a.g(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (cilVarG == null) {
            cilVarG = defpackage.cil.a;
        }
        this.a = cilVarG;
        return this.b;
    }
}
