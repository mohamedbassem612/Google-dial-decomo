package com.google.apps.tiktok.concurrent.futuresmixin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ParcelableFuture implements android.os.Parcelable {
    public final int a;
    public boolean b;
    public ahyn c;
    public java.lang.Object d;
    public java.lang.Object e;
    private java.lang.Throwable g;
    private agtn h;
    private static final aimz f = aimz.i("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(6);

    public ParcelableFuture(android.os.Parcel parcel) {
        this.c = ahwt.a;
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.d = parcel.readValue(classLoader);
            int i = parcel.readInt();
            this.c = ahyn.h(java.lang.Integer.valueOf(i));
            if (i == 1) {
                this.b = true;
                this.e = parcel.readValue(classLoader);
                this.g = (java.lang.Throwable) parcel.readValue(classLoader);
            }
        } catch (java.lang.RuntimeException e) {
            f.c().k(e).l("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java").w("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.g = e;
        }
    }

    private static void d(java.lang.Object obj, android.os.Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (java.lang.RuntimeException e) {
            parcel.setDataPosition(iDataPosition);
            a.by(f.c(), "Result lost due to non-parcelable type.", "com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", (char) 238, "ParcelableFuture.java", e);
            throw new java.lang.IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))), e);
        }
    }

    public final void a() {
        agtn agtnVar = this.h;
        if (agtnVar != null) {
            java.lang.Throwable th = this.g;
            if (th != null) {
                agtnVar.a.execute(ahqx.h(new defpackage.acxq(agtnVar, this, th, 12)));
            } else {
                agtnVar.a.execute(ahqx.h(new defpackage.acxq(agtnVar, this, this.e, 11)));
            }
        }
    }

    public final void b(java.lang.Throwable th) {
        this.g = th;
        this.b = true;
        a();
    }

    public final void c(agtn agtnVar) {
        this.h = agtnVar;
        if (agtnVar == null || !this.b) {
            return;
        }
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj = this.d;
        java.lang.String str3 = "";
        if (obj != null) {
            str = "input=" + obj.getClass().getName() + ';';
        } else {
            str = "";
        }
        java.lang.Object obj2 = this.e;
        if (obj2 != null) {
            str2 = "result=" + obj2.getClass().getName() + ';';
        } else {
            str2 = "";
        }
        java.lang.Throwable th = this.g;
        if (th != null) {
            str3 = "error=" + th.getClass().getName() + ';';
        }
        return "ParcelableFuture(" + str + str2 + str3 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        try {
            d(this.d, parcel);
        } catch (java.lang.RuntimeException e) {
            parcel.writeValue(null);
            this.b = true;
            this.g = new java.lang.IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.e = null;
        }
        parcel.writeInt(true != this.b ? 2 : 1);
        if (this.b) {
            try {
                d(this.e, parcel);
            } catch (java.lang.RuntimeException e2) {
                parcel.writeValue(null);
                this.g = new java.lang.IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                d(this.g, parcel);
            } catch (java.lang.RuntimeException e3) {
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.g))), e3);
                this.g = illegalArgumentException;
                d(illegalArgumentException, parcel);
            }
        }
    }

    public ParcelableFuture(int i, java.lang.Object obj, ajcq ajcqVar) {
        this.c = ahwt.a;
        this.a = i;
        this.d = obj;
        aiql.I(ajcqVar, ahqx.f(new defpackage.agto(this)), ajbm.a);
    }
}
