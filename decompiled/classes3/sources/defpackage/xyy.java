package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyy implements defpackage.xzq, defpackage.xza {
    private final /* synthetic */ int $cid;
    private final android.content.Context a;

    public xyy(android.content.Context context, int i) {
        this.$cid = i;
        this.a = context;
    }

    @Override // defpackage.xza
    public final java.lang.Class a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? java.io.InputStream.class : android.content.res.AssetFileDescriptor.class;
        }
        return android.graphics.drawable.Drawable.class;
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.xzb(this.a, (defpackage.xza) this, 0) : new defpackage.xzb(this.a, (defpackage.xza) this, 0);
        }
        return new defpackage.xzb(this.a, (defpackage.xza) this, 0);
    }

    @Override // defpackage.xza
    public final /* synthetic */ java.lang.Object c(android.content.res.Resources.Theme theme, android.content.res.Resources resources, int i) {
        int i2 = this.$cid;
        if (i2 != 0) {
            return i2 != 1 ? resources.openRawResource(i) : resources.openRawResourceFd(i);
        }
        android.content.Context context = this.a;
        return defpackage.ycn.a(context, context, i, theme);
    }

    @Override // defpackage.xza
    public final /* synthetic */ void d(java.lang.Object obj) throws java.io.IOException {
        int i = this.$cid;
        if (i == 0) {
        } else if (i != 1) {
            ((java.io.InputStream) obj).close();
        } else {
            ((android.content.res.AssetFileDescriptor) obj).close();
        }
    }
}
