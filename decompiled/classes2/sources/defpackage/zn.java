package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zn {
    public static final defpackage.zn a = new defpackage.zn(new defpackage.zm());
    public static final defpackage.zn b;
    public static final defpackage.zn c;
    public static final defpackage.zn d;
    public static final defpackage.zn e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final defpackage.zk k;

    static {
        defpackage.zm zmVar = new defpackage.zm();
        zmVar.d = 0;
        zmVar.e = false;
        zmVar.c = 1;
        zmVar.a = true;
        zmVar.b = false;
        b = new defpackage.zn(zmVar);
        defpackage.zm zmVar2 = new defpackage.zm();
        zmVar2.d = 2;
        zmVar2.e = true;
        zmVar2.c = 2;
        zmVar2.b = true;
        zmVar2.a = false;
        c = new defpackage.zn(zmVar2);
        defpackage.zm zmVar3 = new defpackage.zm();
        zmVar3.d = 0;
        zmVar3.e = true;
        zmVar3.c = 2;
        zmVar3.b = true;
        zmVar3.a = true;
        defpackage.zn znVar = new defpackage.zn(zmVar3);
        d = znVar;
        defpackage.zm zmVar4 = new defpackage.zm(znVar);
        zmVar4.b = true;
        e = new defpackage.zn(zmVar4);
    }

    public zn(defpackage.zm zmVar) {
        this.j = zmVar.a;
        this.f = zmVar.c;
        this.g = zmVar.d;
        this.i = zmVar.b;
        this.h = zmVar.e;
        this.k = zmVar.f;
    }

    public final void a(androidx.car.app.model.Row row) {
        if (!this.j && row.getOnClickDelegate() != null) {
            throw new java.lang.IllegalArgumentException("A click listener is not allowed on the row");
        }
        if (!this.i && row.getToggle() != null) {
            throw new java.lang.IllegalArgumentException("A toggle is not allowed on the row");
        }
        androidx.car.app.model.CarIcon image = row.getImage();
        if (image != null) {
            if (!this.h) {
                throw new java.lang.IllegalArgumentException("An image is not allowed on the row");
            }
            this.k.a(image);
        }
        int size = row.getTexts().size();
        int i = this.f;
        if (size > i) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "The number of lines of texts for the row exceeded the supported max of "));
        }
    }
}
