package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sd {
    public long a;
    public int b;
    public java.util.Map c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private long g;
    private java.util.List h;

    public sd(androidx.appsearch.safeparcel.GenericDocumentParcel genericDocumentParcel) {
        j$.util.Objects.requireNonNull(genericDocumentParcel);
        this.d = genericDocumentParcel.a;
        this.e = genericDocumentParcel.b;
        this.f = genericDocumentParcel.c;
        this.a = genericDocumentParcel.d;
        this.g = genericDocumentParcel.e;
        this.b = genericDocumentParcel.f;
        java.util.Map map = genericDocumentParcel.i;
        this.c = new aca(map.size());
        for (androidx.appsearch.safeparcel.PropertyParcel propertyParcel : map.values()) {
            this.c.put(propertyParcel.a, propertyParcel);
        }
        this.h = genericDocumentParcel.h;
    }

    public final androidx.appsearch.safeparcel.GenericDocumentParcel a() {
        long jCurrentTimeMillis = this.a;
        if (jCurrentTimeMillis == -1) {
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.a = jCurrentTimeMillis;
        }
        return new androidx.appsearch.safeparcel.GenericDocumentParcel(this.d, this.e, this.f, jCurrentTimeMillis, this.g, this.b, new java.util.ArrayList(this.c.values()), this.h);
    }

    public final void b(java.lang.String str, androidx.appsearch.safeparcel.PropertyParcel propertyParcel) {
        j$.util.Objects.requireNonNull(propertyParcel);
        this.c.put(str, propertyParcel);
    }

    public final void c(java.util.List list) {
        if (list == null) {
            this.h = null;
        } else {
            this.h = new java.util.ArrayList(list);
        }
    }

    public final void d(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Document ttlMillis cannot be negative.");
        }
        this.g = j;
    }

    public sd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.d = (java.lang.String) j$.util.Objects.requireNonNull(str);
        this.e = (java.lang.String) j$.util.Objects.requireNonNull(str2);
        this.f = (java.lang.String) j$.util.Objects.requireNonNull(str3);
        this.a = -1L;
        this.g = 0L;
        this.b = 0;
        this.c = new aca();
    }
}
