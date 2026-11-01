package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aidd extends defpackage.aicr implements defpackage.aikr {
    private static final long serialVersionUID = 7431625294878419160L;

    public aidd(java.util.Map map) {
        super(map);
    }

    @Override // defpackage.aicr
    public /* bridge */ /* synthetic */ java.util.Collection a() {
        throw null;
    }

    @Override // defpackage.aicr
    public final /* synthetic */ java.util.Collection b() {
        return java.util.Collections.EMPTY_SET;
    }

    @Override // defpackage.aicr
    public final java.util.Collection d(java.util.Collection collection) {
        return j$.util.DesugarCollections.unmodifiableSet((java.util.Set) collection);
    }

    @Override // defpackage.aicr
    public final java.util.Collection e(java.lang.Object obj, java.util.Collection collection) {
        return new aicq(this, obj, (java.util.Set) collection);
    }

    @Override // defpackage.aicr, defpackage.aije
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final java.util.Set c(java.lang.Object obj) {
        return (java.util.Set) super.c(obj);
    }

    public final void g(java.lang.Object obj) {
    }

    @Override // defpackage.aicr, defpackage.aije
    public final /* bridge */ /* synthetic */ java.util.Collection i() {
        return (java.util.Set) super.i();
    }
}
