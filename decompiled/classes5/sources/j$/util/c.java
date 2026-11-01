package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class c implements java.util.Comparator, java.io.Serializable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.Comparator b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ c(java.util.Comparator comparator, java.lang.Object obj, byte b) {
        this.a = b;
        this.b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.a;
        java.lang.Object obj3 = this.c;
        java.util.Comparator comparator = this.b;
        switch (b) {
            case 0:
                java.util.Comparator comparator2 = (java.util.Comparator) obj3;
                int iCompare = comparator.compare(obj, obj2);
                return iCompare == 0 ? comparator2.compare(obj, obj2) : iCompare;
            default:
                java.util.function.Function function = (java.util.function.Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
