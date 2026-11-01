package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mgq extends defpackage.mgd {
    final /* synthetic */ defpackage.mgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgq(defpackage.mgu mguVar, java.lang.Object obj, java.lang.Object obj2, j$.util.Optional optional) {
        super(mguVar, obj, obj2, optional);
        j$.util.Objects.requireNonNull(mguVar);
        this.e = mguVar;
    }

    public final java.lang.Object f(final java.util.function.Function function) {
        this.e.f((j$.util.Optional) this.c, this.a, new defpackage.mfx() { // from class: mgn
            @Override // defpackage.mfx
            public final j$.util.Optional a(java.lang.Object obj) {
                j$.util.Optional optional = (j$.util.Optional) obj;
                defpackage.mgl mglVar = new defpackage.mgl(function);
                if (true != optional.isPresent()) {
                    return optional;
                }
                return j$.util.Optional.ofNullable(new defpackage.kaw(defpackage.gus.av(((java.lang.Long) aa$.ExternalSyntheticApiModelOutline1.m(mglVar.a, optional.get())).longValue())));
            }
        });
        return this.b;
    }

    public final java.lang.Object g(final java.util.function.Function function) {
        this.e.f((j$.util.Optional) this.c, this.a, new defpackage.mfx() { // from class: mgk
            @Override // defpackage.mfx
            public final j$.util.Optional a(java.lang.Object obj) {
                j$.util.Optional optional = (j$.util.Optional) obj;
                defpackage.mgo mgoVar = new defpackage.mgo(function);
                if (true != optional.isPresent()) {
                    return optional;
                }
                return j$.util.Optional.ofNullable(new defpackage.kaw(defpackage.gus.aw((java.lang.String) aa$.ExternalSyntheticApiModelOutline1.m(mgoVar.a, optional.get()))));
            }
        });
        return this.b;
    }

    public final java.lang.Object h(java.util.function.Function function) {
        this.e.f((j$.util.Optional) this.c, this.a, new mgm(this, function));
        return this.b;
    }

    public final java.lang.Object i() {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((j$.util.Optional) this.c).isPresent());
        defpackage.mgh mghVar = new defpackage.mgh(1);
        this.e.f(boolValueOf, this.a, mghVar);
        return this.b;
    }
}
