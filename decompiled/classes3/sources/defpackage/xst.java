package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xst implements defpackage.yfw {
    final /* synthetic */ defpackage.xrr a;
    final /* synthetic */ java.util.List b;
    final /* synthetic */ defpackage.yea c;
    private boolean d;

    public xst(defpackage.xrr xrrVar, java.util.List list, defpackage.yea yeaVar) {
        this.a = xrrVar;
        this.b = list;
        this.c = yeaVar;
    }

    @Override // defpackage.yfw
    public final /* synthetic */ java.lang.Object a() throws java.lang.Throwable {
        boolean z;
        java.util.List list;
        defpackage.xxt xxtVar;
        defpackage.xuu ybuVar;
        defpackage.ybz ybzVar;
        android.content.Context context;
        defpackage.ybz ybzVar2;
        defpackage.ybw ybwVar;
        defpackage.xuu xuuVar;
        defpackage.ybz ybzVar3;
        defpackage.xuu xuuVar2;
        defpackage.ybz ybzVar4;
        defpackage.ybz ybzVar5;
        defpackage.xst xstVar = this;
        if (xstVar.d) {
            throw new java.lang.IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        dzk.G("Glide registry");
        xstVar.d = true;
        try {
            defpackage.xrr xrrVar = xstVar.a;
            java.util.List list2 = xstVar.b;
            defpackage.yea yeaVar = xstVar.c;
            defpackage.xxm xxmVar = xrrVar.b;
            defpackage.xxt xxtVar2 = xrrVar.e;
            defpackage.xsk xskVar = xrrVar.c;
            android.content.Context applicationContext = xskVar.getApplicationContext();
            xtq xtqVar = xskVar.g;
            defpackage.xss xssVar = new defpackage.xss();
            xssVar.j(new defpackage.yaw());
            xssVar.j(new defpackage.ybl());
            android.content.res.Resources resources = applicationContext.getResources();
            java.util.List listB = xssVar.b();
            defpackage.yct yctVar = new defpackage.yct(applicationContext, listB, xxmVar, xxtVar2);
            try {
                defpackage.yci yciVar = new defpackage.yci(xxmVar, new defpackage.ycf(2));
                defpackage.ybh ybhVar = new defpackage.ybh(xssVar.b(), resources.getDisplayMetrics(), xxmVar, xxtVar2, xtqVar);
                if (xtqVar.a(defpackage.xrw.class)) {
                    try {
                        if (xtqVar.a(defpackage.xsf.class)) {
                            defpackage.ybz ybzVar6 = new defpackage.ybz(ybhVar, xxtVar2, 2);
                            xxtVar = xxtVar2;
                            list = listB;
                            ybzVar = null;
                            ybuVar = ybzVar6;
                        } else {
                            boolean zA = xtqVar.a(defpackage.xsh.class);
                            boolean zA2 = xtqVar.a(defpackage.xse.class);
                            boolean zA3 = xtqVar.a(defpackage.xsd.class);
                            list = listB;
                            xxtVar = xxtVar2;
                            ybuVar = new defpackage.ybu(list, zA, xxtVar2, zA2, zA3);
                            ybzVar = new defpackage.ybz(ybhVar, xxtVar, 2);
                        }
                        defpackage.ybz ybzVar7 = ybzVar;
                        defpackage.ybz ybzVar8 = new defpackage.ybz(list, xxtVar, xtqVar.a(defpackage.xsd.class), 1);
                        if (android.os.Build.VERSION.SDK_INT < 35 || !xtqVar.a(defpackage.xrz.class)) {
                            context = applicationContext;
                            ybzVar2 = null;
                        } else {
                            context = applicationContext;
                            ybzVar2 = new defpackage.ybz(context, 3);
                        }
                        defpackage.ybz ybzVar9 = ybzVar2;
                        ybwVar = new defpackage.ybw(ybhVar, 1);
                        xuuVar = ybzVar8;
                        ybzVar3 = ybzVar7;
                        xuuVar2 = ybuVar;
                        ybzVar4 = ybzVar9;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        z = false;
                        xstVar = this;
                        xstVar.d = z;
                        android.os.Trace.endSection();
                        throw th;
                    }
                } else {
                    xxtVar = xxtVar2;
                    list = listB;
                    context = applicationContext;
                    defpackage.ybw ybwVar2 = new defpackage.ybw(ybhVar, 1);
                    defpackage.ybz ybzVar10 = new defpackage.ybz(ybhVar, xxtVar, 2);
                    xuuVar = ybwVar2;
                    ybzVar3 = null;
                    xuuVar2 = ybzVar10;
                    ybzVar4 = null;
                    ybwVar = null;
                }
                xssVar.g("Animation", java.io.InputStream.class, android.graphics.drawable.Drawable.class, new defpackage.ybw(new defpackage.uyg(list, xxtVar, (byte[]) null), 3));
                defpackage.ybz ybzVar11 = ybzVar4;
                xssVar.g("Animation", java.nio.ByteBuffer.class, android.graphics.drawable.Drawable.class, new defpackage.ybw(new defpackage.uyg(list, xxtVar, (byte[]) null), 2));
                defpackage.ycr ycrVar = new defpackage.ycr(context);
                defpackage.yan yanVar = new defpackage.yan(xxtVar);
                android.content.Context context2 = context;
                defpackage.ydd yddVar = new defpackage.ydd(1);
                defpackage.ydg ydgVar = new defpackage.ydg(1);
                android.content.ContentResolver contentResolver = context2.getContentResolver();
                xssVar.d(java.nio.ByteBuffer.class, new defpackage.xyu());
                xssVar.d(java.io.InputStream.class, new defpackage.xzw(xxtVar));
                xssVar.g("Bitmap", java.nio.ByteBuffer.class, android.graphics.Bitmap.class, xuuVar);
                if (ybwVar != null) {
                    xssVar.g("Bitmap", java.nio.ByteBuffer.class, android.graphics.Bitmap.class, ybwVar);
                }
                xssVar.g("Bitmap", java.io.InputStream.class, android.graphics.Bitmap.class, xuuVar2);
                if (ybzVar3 != null) {
                    xssVar.g("Bitmap", java.io.InputStream.class, android.graphics.Bitmap.class, ybzVar3);
                }
                if (ybzVar11 != null) {
                    ybzVar5 = ybzVar11;
                    xssVar.i(android.net.Uri.class, android.graphics.Bitmap.class, ybzVar5);
                    xssVar.h(android.net.Uri.class, android.net.Uri.class, defpackage.yab.a);
                } else {
                    ybzVar5 = ybzVar11;
                }
                if (defpackage.xvp.d()) {
                    xssVar.g("Bitmap", android.os.ParcelFileDescriptor.class, android.graphics.Bitmap.class, new defpackage.ybw(ybhVar, 0));
                }
                defpackage.xxt xxtVar3 = xxtVar;
                xssVar.g("Bitmap", android.content.res.AssetFileDescriptor.class, android.graphics.Bitmap.class, new defpackage.yci(xxmVar, new defpackage.ycf(1)));
                xssVar.g("Bitmap", android.os.ParcelFileDescriptor.class, android.graphics.Bitmap.class, yciVar);
                defpackage.yab yabVar = defpackage.yab.a;
                xssVar.f(android.graphics.Bitmap.class, android.graphics.Bitmap.class, yabVar);
                xssVar.g("Bitmap", android.graphics.Bitmap.class, android.graphics.Bitmap.class, new defpackage.ycs(1));
                xssVar.e(android.graphics.Bitmap.class, yanVar);
                xssVar.g("BitmapDrawable", java.nio.ByteBuffer.class, android.graphics.drawable.BitmapDrawable.class, new defpackage.yal(resources, xuuVar));
                xssVar.g("BitmapDrawable", java.io.InputStream.class, android.graphics.drawable.BitmapDrawable.class, new defpackage.yal(resources, xuuVar2));
                xssVar.g("BitmapDrawable", android.os.ParcelFileDescriptor.class, android.graphics.drawable.BitmapDrawable.class, new defpackage.yal(resources, yciVar));
                if (ybzVar5 != null) {
                    xssVar.i(android.net.Uri.class, android.graphics.drawable.BitmapDrawable.class, new defpackage.yal(resources, ybzVar5));
                }
                xssVar.e(android.graphics.drawable.BitmapDrawable.class, new defpackage.yam(xxmVar, yanVar));
                xssVar.g("Animation", java.io.InputStream.class, defpackage.ycv.class, new defpackage.ydc(list, yctVar, xxtVar3));
                xssVar.g("Animation", java.nio.ByteBuffer.class, defpackage.ycv.class, yctVar);
                xssVar.e(defpackage.ycv.class, new defpackage.ycw());
                xssVar.f(defpackage.xth.class, defpackage.xth.class, yabVar);
                xssVar.g("Bitmap", defpackage.xth.class, android.graphics.Bitmap.class, new defpackage.ybw(xxmVar, 4));
                xssVar.g("legacy_append", android.net.Uri.class, android.graphics.drawable.Drawable.class, ycrVar);
                xssVar.g("legacy_append", android.net.Uri.class, android.graphics.Bitmap.class, new defpackage.ybz(ycrVar, xxmVar, 0));
                xssVar.k(new defpackage.ycj());
                xssVar.f(java.io.File.class, java.nio.ByteBuffer.class, new defpackage.xyt(2));
                xssVar.f(java.io.File.class, java.io.InputStream.class, new defpackage.xyx(new defpackage.xze(0), 2));
                xssVar.g("legacy_append", java.io.File.class, java.io.File.class, new defpackage.ycs(2));
                xssVar.f(java.io.File.class, android.os.ParcelFileDescriptor.class, new defpackage.xyx(new defpackage.xze(1), 2));
                xssVar.f(java.io.File.class, java.io.File.class, yabVar);
                xssVar.k(new defpackage.xvl(xxtVar3));
                if (defpackage.xvp.d()) {
                    xssVar.k(new defpackage.xvo());
                }
                defpackage.xyy xyyVar = new defpackage.xyy(context2, 2);
                defpackage.xyy xyyVar2 = new defpackage.xyy(context2, 1);
                defpackage.xyy xyyVar3 = new defpackage.xyy(context2, 0);
                xssVar.f(java.lang.Integer.TYPE, java.io.InputStream.class, xyyVar);
                xssVar.f(java.lang.Integer.class, java.io.InputStream.class, xyyVar);
                xssVar.f(java.lang.Integer.TYPE, android.content.res.AssetFileDescriptor.class, xyyVar2);
                xssVar.f(java.lang.Integer.class, android.content.res.AssetFileDescriptor.class, xyyVar2);
                xssVar.f(java.lang.Integer.TYPE, android.graphics.drawable.Drawable.class, xyyVar3);
                xssVar.f(java.lang.Integer.class, android.graphics.drawable.Drawable.class, xyyVar3);
                xssVar.f(android.net.Uri.class, java.io.InputStream.class, new defpackage.xyx((java.lang.Object) context2, 4));
                xssVar.f(android.net.Uri.class, android.content.res.AssetFileDescriptor.class, new defpackage.xyx((java.lang.Object) context2, 3));
                defpackage.xzv xzvVar = new defpackage.xzv(resources, 3);
                defpackage.xzv xzvVar2 = new defpackage.xzv(resources, 0);
                defpackage.xzv xzvVar3 = new defpackage.xzv(resources, 2);
                xssVar.f(java.lang.Integer.class, android.net.Uri.class, xzvVar);
                xssVar.f(java.lang.Integer.TYPE, android.net.Uri.class, xzvVar);
                xssVar.f(java.lang.Integer.class, android.content.res.AssetFileDescriptor.class, xzvVar2);
                xssVar.f(java.lang.Integer.TYPE, android.content.res.AssetFileDescriptor.class, xzvVar2);
                xssVar.f(java.lang.Integer.class, java.io.InputStream.class, xzvVar3);
                xssVar.f(java.lang.Integer.TYPE, java.io.InputStream.class, xzvVar3);
                xssVar.f(java.lang.String.class, java.io.InputStream.class, new defpackage.xyx(0));
                xssVar.f(android.net.Uri.class, java.io.InputStream.class, new defpackage.xyx(0));
                xssVar.f(java.lang.String.class, java.io.InputStream.class, new defpackage.xyt(5));
                xssVar.f(java.lang.String.class, android.os.ParcelFileDescriptor.class, new defpackage.xyt(4));
                xssVar.f(java.lang.String.class, android.content.res.AssetFileDescriptor.class, new defpackage.xyt(3));
                xssVar.f(android.net.Uri.class, java.io.InputStream.class, new defpackage.xyp(context2.getAssets(), 0));
                xssVar.f(android.net.Uri.class, android.content.res.AssetFileDescriptor.class, new defpackage.xyp(context2.getAssets(), 1));
                xssVar.f(android.net.Uri.class, java.io.InputStream.class, new defpackage.xzv(context2, 5));
                xssVar.f(android.net.Uri.class, java.io.InputStream.class, new defpackage.xzv(context2, 6));
                xssVar.f(android.net.Uri.class, java.io.InputStream.class, new defpackage.yae(context2, java.io.InputStream.class));
                xssVar.f(android.net.Uri.class, android.os.ParcelFileDescriptor.class, new defpackage.yae(context2, android.os.ParcelFileDescriptor.class));
                boolean zA4 = xtqVar.a(defpackage.xsi.class);
                xssVar.f(android.net.Uri.class, java.io.InputStream.class, new defpackage.xzy(contentResolver, zA4, 2));
                xssVar.f(android.net.Uri.class, android.os.ParcelFileDescriptor.class, new defpackage.xzy(contentResolver, zA4, 0));
                xssVar.f(android.net.Uri.class, android.content.res.AssetFileDescriptor.class, new defpackage.xzy(contentResolver, zA4, 1));
                xssVar.f(android.net.Uri.class, java.io.InputStream.class, new defpackage.yab(0));
                xssVar.f(java.net.URL.class, java.io.InputStream.class, new defpackage.yab(2));
                xssVar.f(android.net.Uri.class, java.io.File.class, new defpackage.xzv(context2, 1));
                xssVar.f(defpackage.xzg.class, java.io.InputStream.class, new defpackage.xzv(4));
                xssVar.f(byte[].class, java.nio.ByteBuffer.class, new defpackage.xyt(1));
                xssVar.f(byte[].class, java.io.InputStream.class, new defpackage.xyt(0));
                xssVar.f(android.net.Uri.class, android.net.Uri.class, yabVar);
                xssVar.f(android.graphics.drawable.Drawable.class, android.graphics.drawable.Drawable.class, yabVar);
                xssVar.g("legacy_append", android.graphics.drawable.Drawable.class, android.graphics.drawable.Drawable.class, new defpackage.ycs(0));
                xssVar.l(android.graphics.Bitmap.class, android.graphics.drawable.BitmapDrawable.class, new defpackage.ydd(resources, 0));
                xssVar.l(android.graphics.Bitmap.class, byte[].class, yddVar);
                xssVar.l(android.graphics.drawable.Drawable.class, byte[].class, new defpackage.yde(xxmVar, yddVar, ydgVar));
                xssVar.l(defpackage.ycv.class, byte[].class, ydgVar);
                defpackage.yci yciVar2 = new defpackage.yci(xxmVar, new defpackage.ycf(0));
                xssVar.g("legacy_append", java.nio.ByteBuffer.class, android.graphics.Bitmap.class, yciVar2);
                xssVar.g("legacy_append", java.nio.ByteBuffer.class, android.graphics.drawable.BitmapDrawable.class, new defpackage.yal(resources, yciVar2));
                defpackage.xfc.g(context2, xrrVar, xssVar, list2, yeaVar);
                this.d = false;
                android.os.Trace.endSection();
                return xssVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                xstVar = this;
                z = false;
                xstVar.d = z;
                android.os.Trace.endSection();
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }
}
