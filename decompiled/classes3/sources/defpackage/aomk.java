package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aomk implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.lang.Class a;

    public aomk(java.lang.Enum[] enumArr) {
        aooh.f(enumArr, "entries");
        java.lang.Class<?> componentType = enumArr.getClass().getComponentType();
        aooh.c(componentType);
        this.a = componentType;
    }

    private final java.lang.Object readResolve() {
        java.lang.Object[] enumConstants = this.a.getEnumConstants();
        aooh.e(enumConstants, "getEnumConstants(...)");
        return ajsz.am((java.lang.Enum[]) enumConstants);
    }
}
