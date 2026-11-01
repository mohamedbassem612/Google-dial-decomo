package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uro implements defpackage.urm {
    private static final int[] a = {2130969322};
    private final android.content.Context b;

    public uro(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.b = context;
    }

    @Override // defpackage.urm
    public final j$.util.Optional a() {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.b.obtainStyledAttributes(a);
        defpackage.aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(resourceId);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(numValueOf);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }
}
