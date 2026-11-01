package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajmr implements defpackage.ajel {
    public final java.util.Map a;
    public final java.util.Map b;
    public final java.util.Map c;
    public final defpackage.ajms d;

    public ajmr(java.util.Map map, java.util.Map map2, java.util.Map map3, defpackage.ajms ajmsVar) {
        this.a = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map));
        this.b = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map2));
        this.c = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map3));
        this.d = ajmsVar;
    }

    @Override // defpackage.ajel
    public final java.lang.Object a(java.lang.Class cls) {
        if (cls.equals(defpackage.ajff.class)) {
            return cls.cast(this.d);
        }
        return null;
    }
}
