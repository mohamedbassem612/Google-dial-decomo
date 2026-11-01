package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a extends j$.time.format.z {
    public final /* synthetic */ j$.time.format.y d;

    public a(j$.time.format.y yVar) {
        this.d = yVar;
    }

    @Override // j$.time.format.z
    public final java.lang.String b(j$.time.chrono.a aVar, j$.time.temporal.l lVar, long j, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        return this.d.a(j, textStyle);
    }

    @Override // j$.time.format.z
    public final java.lang.String c(j$.time.temporal.l lVar, long j, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        return this.d.a(j, textStyle);
    }

    @Override // j$.time.format.z
    public final java.util.Iterator d(j$.time.chrono.a aVar, j$.time.temporal.l lVar, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        java.util.List list = (java.util.List) this.d.b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.z
    public final java.util.Iterator e(j$.time.temporal.l lVar, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        java.util.List list = (java.util.List) this.d.b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
