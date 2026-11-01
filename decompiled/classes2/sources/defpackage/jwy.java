package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jwy implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        defpackage.jxb jxbVar;
        com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA = defpackage.jwz.a();
        java.lang.ClassLoader classLoader = com.android.dialer.callintent.CallIntent$Builder.class.getClassLoader();
        callIntent$BuilderA.u((android.net.Uri) parcel.readParcelable(classLoader));
        try {
            jxbVar = (defpackage.jxb) alad.B(defpackage.jxb.b, parcel.createByteArray(), akzq.a());
        } catch (alaz e) {
            a.bq(defpackage.jwz.a.c(), "received invalid protobuf from call intent", "com/android/dialer/callintent/CallIntent$Builder$1", "createFromParcel", (char) 326, "CallIntent.java", e, zct.b);
            jxbVar = defpackage.jxb.b;
        }
        callIntent$BuilderA.r(jxbVar);
        com.android.dialer.callintent.AutoValue_CallIntent$Builder autoValue_CallIntent$Builder = (com.android.dialer.callintent.AutoValue_CallIntent$Builder) callIntent$BuilderA;
        autoValue_CallIntent$Builder.b = (android.telecom.PhoneAccountHandle) parcel.readParcelable(classLoader);
        callIntent$BuilderA.t(parcel.readInt() != 0);
        parcel.readInt();
        callIntent$BuilderA.q(a.M()[parcel.readInt()]);
        autoValue_CallIntent$Builder.c = parcel.readString();
        callIntent$BuilderA.p(parcel.readInt() != 0);
        android.os.Bundle bundle = parcel.readBundle(classLoader);
        for (java.lang.String str : bundle.keySet()) {
            java.lang.String string = bundle.getString(str);
            ahvr.bR(callIntent$BuilderA.x(str), "Duplicate key: %s", str);
            if (autoValue_CallIntent$Builder.d == null) {
                if (autoValue_CallIntent$Builder.e == null) {
                    autoValue_CallIntent$Builder.d = new aigb(4);
                } else {
                    autoValue_CallIntent$Builder.d = new aigb(4);
                    autoValue_CallIntent$Builder.d.l(autoValue_CallIntent$Builder.e);
                    autoValue_CallIntent$Builder.e = null;
                }
            }
            autoValue_CallIntent$Builder.d.i(str, string);
        }
        android.os.Bundle bundle2 = parcel.readBundle(classLoader);
        for (java.lang.String str2 : bundle2.keySet()) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(bundle2.getLong(str2));
            ahvr.bR(callIntent$BuilderA.x(str2), "Duplicate key: %s", str2);
            if (autoValue_CallIntent$Builder.f == null) {
                if (autoValue_CallIntent$Builder.g == null) {
                    autoValue_CallIntent$Builder.f = new aigb(4);
                } else {
                    autoValue_CallIntent$Builder.f = new aigb(4);
                    autoValue_CallIntent$Builder.f.l(autoValue_CallIntent$Builder.g);
                    autoValue_CallIntent$Builder.g = null;
                }
            }
            autoValue_CallIntent$Builder.f.i(str2, lValueOf);
        }
        android.os.Bundle bundle3 = parcel.readBundle(classLoader);
        for (java.lang.String str3 : bundle3.keySet()) {
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(bundle3.getBoolean(str3));
            ahvr.bR(callIntent$BuilderA.x(str3), "Duplicate key: %s", str3);
            if (autoValue_CallIntent$Builder.h == null) {
                if (autoValue_CallIntent$Builder.i == null) {
                    autoValue_CallIntent$Builder.h = new aigb(4);
                } else {
                    autoValue_CallIntent$Builder.h = new aigb(4);
                    autoValue_CallIntent$Builder.h.l(autoValue_CallIntent$Builder.i);
                    autoValue_CallIntent$Builder.i = null;
                }
            }
            autoValue_CallIntent$Builder.h.i(str3, boolValueOf);
        }
        autoValue_CallIntent$Builder.j = parcel.readBundle(classLoader);
        callIntent$BuilderA.s(abwc.b(parcel.createByteArray()));
        android.os.Bundle bundle4 = parcel.readBundle(classLoader);
        if (bundle4 != null && !bundle4.isEmpty()) {
            autoValue_CallIntent$Builder.a = defpackage.hue.b(bundle4);
        }
        long j = parcel.readLong();
        if (j != 0) {
            callIntent$BuilderA.v(j$.util.Optional.of(java.lang.Long.valueOf(j)));
        }
        return callIntent$BuilderA;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.android.dialer.callintent.CallIntent$Builder[0];
    }
}
