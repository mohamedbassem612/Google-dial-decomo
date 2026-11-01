package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abzb implements defpackage.xuu {
    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) throws java.io.IOException {
        android.graphics.Picture pictureB;
        float fG;
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        try {
            int i3 = defpackage.yiw.e;
            defpackage.yiw yiwVarB = new defpackage.yjq().b(inputStream);
            if (i != Integer.MIN_VALUE) {
                defpackage.yhx yhxVar = yiwVarB.a;
                if (yhxVar == null) {
                    throw new java.lang.IllegalArgumentException("SVG document is empty");
                }
                yhxVar.c = new defpackage.yhh(i);
            }
            if (i2 != Integer.MIN_VALUE) {
                defpackage.yhx yhxVar2 = yiwVarB.a;
                if (yhxVar2 == null) {
                    throw new java.lang.IllegalArgumentException("SVG document is empty");
                }
                yhxVar2.d = new defpackage.yhh(i2);
            }
            defpackage.yhx yhxVar3 = yiwVarB.a;
            defpackage.yhh yhhVar = yhxVar3.c;
            if (yhhVar != null) {
                float f = yiwVarB.b;
                float fG2 = yhhVar.g();
                defpackage.ygv ygvVar = yhxVar3.w;
                if (ygvVar != null) {
                    fG = (ygvVar.d * fG2) / ygvVar.c;
                } else {
                    defpackage.yhh yhhVar2 = yhxVar3.d;
                    fG = yhhVar2 != null ? yhhVar2.g() : fG2;
                }
                pictureB = yiwVarB.b((int) java.lang.Math.ceil(fG2), (int) java.lang.Math.ceil(fG));
            } else {
                pictureB = yiwVarB.b(512, 512);
            }
            return new defpackage.ycl(new android.graphics.drawable.PictureDrawable(pictureB), 2);
        } catch (defpackage.yji e) {
            throw new java.io.IOException("Unable to decode SVG from stream.", e);
        }
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) throws java.io.IOException {
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        byte[] bArr = new byte[256];
        int i = 0;
        while (i < 256) {
            int i2 = inputStream.read(bArr, i, 256 - i);
            if (i2 == -1) {
                break;
            }
            i += i2;
        }
        java.lang.String lowerCase = new java.lang.String(bArr, 0, i, java.nio.charset.StandardCharsets.UTF_8).toLowerCase(java.util.Locale.getDefault());
        return (i >= 4 && lowerCase.contains("<svg")) || (i >= 5 && lowerCase.contains(" svg "));
    }
}
