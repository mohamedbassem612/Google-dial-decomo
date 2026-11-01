package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class euj {
    public int a;
    public java.lang.Object b;
    private int c;
    private java.lang.Object d;

    public euj(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.b = new java.util.ArrayList();
        this.c = -1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), dui.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.c = typedArrayObtainStyledAttributes.getResourceId(1, this.c);
                java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                context.getResources().getResourceName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    defpackage.due dueVar = new defpackage.due();
                    this.d = dueVar;
                    dueVar.d(context, this.c);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final java.lang.Object f() {
        ahvr.bY(this.a > 0);
        java.lang.Object obj = this.b;
        int i = this.c;
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.a--;
        return obj2;
    }

    public final synchronized int a() {
        return this.a;
    }

    public final synchronized java.lang.Object b() {
        if (this.a == 0) {
            return null;
        }
        return f();
    }

    public final synchronized java.lang.Object c(long j) {
        java.lang.Object objF;
        objF = null;
        while (this.a > 0) {
            if (j - ((long[]) this.d)[this.c] < 0) {
                break;
            }
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j, java.lang.Object obj) {
        int i = this.a;
        if (i > 0) {
            if (j <= ((long[]) this.d)[((this.c + i) - 1) % ((java.lang.Object[]) this.b).length]) {
                e();
            }
        }
        int length = ((java.lang.Object[]) this.b).length;
        if (this.a >= length) {
            int i2 = length << 1;
            long[] jArr = new long[i2];
            java.lang.Object[] objArr = new java.lang.Object[i2];
            int i3 = this.c;
            int i4 = length - i3;
            java.lang.System.arraycopy(this.d, i3, jArr, 0, i4);
            java.lang.System.arraycopy(this.b, this.c, objArr, 0, i4);
            int i5 = this.c;
            if (i5 > 0) {
                java.lang.System.arraycopy(this.d, 0, jArr, i4, i5);
                java.lang.System.arraycopy(this.b, 0, objArr, i4, this.c);
            }
            this.d = jArr;
            this.b = objArr;
            this.c = 0;
        }
        int i6 = this.c;
        int i7 = this.a;
        java.lang.Object obj2 = this.b;
        int length2 = (i6 + i7) % ((java.lang.Object[]) obj2).length;
        ((long[]) this.d)[length2] = j;
        ((java.lang.Object[]) obj2)[length2] = obj;
        this.a = i7 + 1;
    }

    public final synchronized void e() {
        this.c = 0;
        this.a = 0;
        java.util.Arrays.fill((java.lang.Object[]) this.b, (java.lang.Object) null);
    }

    public euj() {
        this.d = new long[10];
        this.b = new java.lang.Object[10];
    }
}
