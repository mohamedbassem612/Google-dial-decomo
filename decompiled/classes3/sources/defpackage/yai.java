package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yai implements android.graphics.ImageDecoder.OnHeaderDecodedListener {
    private final defpackage.ybq a = defpackage.ybq.a();
    private final int b;
    private final int c;
    private final defpackage.xud d;
    private final defpackage.ybe e;
    private final boolean f;
    private final defpackage.xut g;
    private final boolean h;
    private final boolean i;

    public yai(int i, int i2, defpackage.xus xusVar, boolean z) {
        this.b = i;
        this.c = i2;
        this.i = z;
        this.d = (defpackage.xud) xusVar.b(defpackage.ybh.a);
        this.e = (defpackage.ybe) xusVar.b(defpackage.ybe.g);
        defpackage.xur xurVar = defpackage.ybh.d;
        this.f = xusVar.b(xurVar) != null && ((java.lang.Boolean) xusVar.b(xurVar)).booleanValue();
        this.g = (defpackage.xut) xusVar.b(defpackage.ybh.b);
        java.lang.Boolean bool = (java.lang.Boolean) xusVar.b(defpackage.ybh.f);
        this.h = bool != null && bool.booleanValue();
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
        defpackage.ybq ybqVar = this.a;
        int width = this.b;
        int height = this.c;
        if (ybqVar.b(width, height, this.f, this.h)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == defpackage.xud.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new defpackage.yah(this));
        android.util.Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.e.a(size.getWidth(), size.getHeight(), width, height);
        int iRound = java.lang.Math.round(size.getWidth() * fA);
        float height2 = size.getHeight() * fA;
        boolean z = this.i;
        int iRound2 = java.lang.Math.round(height2);
        if (z) {
            iRound = java.lang.Math.max(1, iRound);
            iRound2 = java.lang.Math.max(1, iRound2);
        }
        if (android.util.Log.isLoggable("ImageDecoder", 2)) {
            android.util.Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + 'x' + size.getHeight() + "] to [" + iRound + 'x' + iRound2 + "] scaleFactor: " + fA);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        defpackage.xut xutVar = this.g;
        if (xutVar != null) {
            imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get((xutVar == defpackage.xut.b && imageInfo.getColorSpace() != null && rs$.ExternalSyntheticApiModelOutline0.m(imageInfo.getColorSpace())) ? da$.ExternalSyntheticApiModelOutline1.m$3() : android.graphics.ColorSpace.Named.SRGB));
        }
    }
}
