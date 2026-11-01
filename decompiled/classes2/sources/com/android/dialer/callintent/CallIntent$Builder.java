package com.android.dialer.callintent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class CallIntent$Builder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.jwy();

    public abstract android.net.Uri a();

    public abstract android.os.Bundle b();

    public abstract android.telecom.PhoneAccountHandle c();

    public abstract defpackage.hue d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract defpackage.jwz e();

    public abstract defpackage.jxb f();

    public abstract aigf g();

    public abstract aigf h();

    public abstract aigf i();

    public abstract j$.util.Optional j();

    public abstract j$.util.Optional k();

    public abstract java.lang.String l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract int o();

    public abstract void p(boolean z);

    public abstract void q(int i);

    public abstract void r(defpackage.jxb jxbVar);

    public abstract void s(j$.util.Optional optional);

    public abstract void t(boolean z);

    public abstract void u(android.net.Uri uri);

    public abstract void v(j$.util.Optional optional);

    public final android.content.Intent w() {
        akzx akzxVarN = defpackage.jxb.b.n(f());
        if (k().isPresent()) {
            long jLongValue = ((java.lang.Long) k().orElseThrow()).longValue();
            akzxVarN.u();
            defpackage.jxb jxbVar = (defpackage.jxb) akzxVarN.b;
            jxbVar.c |= 8388608;
            jxbVar.y = jLongValue;
        }
        r((defpackage.jxb) akzxVarN.p());
        defpackage.jwz jwzVarE = e();
        ahvr.ci(jwzVarE.b);
        defpackage.jxb jxbVar2 = jwzVarE.d;
        ahvr.ci(jxbVar2);
        int iE = defpackage.hmr.e(jxbVar2.d);
        ahvr.bM((iE == 0 || iE == 1) ? false : true);
        defpackage.jwz jwzVarE2 = e();
        android.content.Intent intent = new android.content.Intent("android.intent.action.CALL", jwzVarE2.b);
        intent.putExtra("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", true != jwzVarE2.f ? 0 : 3);
        android.os.Bundle bundle = new android.os.Bundle();
        aigf aigfVar = jwzVarE2.h;
        j$.util.Objects.requireNonNull(bundle);
        j$.util.Map.-EL.forEach(aigfVar, new defpackage.jwx(bundle, 1));
        aigf aigfVar2 = jwzVarE2.i;
        j$.util.Objects.requireNonNull(bundle);
        j$.util.Map.-EL.forEach(aigfVar2, new defpackage.jwx(bundle, 0));
        aigf aigfVar3 = jwzVarE2.j;
        j$.util.Objects.requireNonNull(bundle);
        j$.util.Map.-EL.forEach(aigfVar3, new defpackage.jwx(bundle, 2));
        sns.v(bundle, "com.android.dialer.callintent.CALL_SPECIFIC_APP_DATA", jwzVarE2.d);
        abwc.d(bundle, jwzVarE2.l);
        defpackage.hue hueVar = jwzVarE2.c;
        if (hueVar != null) {
            bundle.putBundle("android.telecom.extra.ASSISTED_DIALING_EXTRAS", hueVar.a());
        }
        bundle.putLong("android.telecom.extra.CALL_CREATED_TIME_MILLIS", android.os.SystemClock.elapsedRealtime());
        android.os.Bundle bundle2 = jwzVarE2.k;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        intent.putExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle);
        android.telecom.PhoneAccountHandle phoneAccountHandle = jwzVarE2.e;
        if (phoneAccountHandle != null) {
            intent.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
        }
        java.lang.String str = jwzVarE2.g;
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.putExtra("android.telecom.extra.CALL_SUBJECT", str);
        }
        intent.putExtras(new android.os.Bundle());
        return intent;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [aonj, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeByteArray(f().i());
        parcel.writeParcelable(c(), i);
        parcel.writeInt(n() ? 1 : 0);
        parcel.writeInt(0);
        parcel.writeInt(o() - 1);
        parcel.writeString(l());
        parcel.writeInt(m() ? 1 : 0);
        android.os.Bundle bundle = new android.os.Bundle();
        aigf aigfVarI = i();
        j$.util.Objects.requireNonNull(bundle);
        j$.util.Map.-EL.forEach(aigfVarI, new defpackage.jwx(bundle, 3));
        parcel.writeBundle(bundle);
        android.os.Bundle bundle2 = new android.os.Bundle();
        aigf aigfVarH = h();
        j$.util.Objects.requireNonNull(bundle2);
        j$.util.Map.-EL.forEach(aigfVarH, new defpackage.jwx(bundle2, 4));
        parcel.writeBundle(bundle2);
        android.os.Bundle bundle3 = new android.os.Bundle();
        aigf aigfVarG = g();
        j$.util.Objects.requireNonNull(bundle3);
        j$.util.Map.-EL.forEach(aigfVarG, new defpackage.jwx(bundle3, 5));
        parcel.writeBundle(bundle3);
        parcel.writeBundle(b());
        j$.util.Optional optionalJ = j();
        aooh.f(optionalJ, "calleeId");
        xbz xbzVar = new xbz(new abiy(12), 8);
        if (true == optionalJ.isPresent()) {
            optionalJ = j$.util.Optional.ofNullable(xbzVar.a.a(optionalJ.get()));
        }
        aooh.e(optionalJ, "map(...)");
        parcel.writeByteArray((byte[]) aooh.q(optionalJ));
        parcel.writeBundle(d() == null ? null : d().a());
        parcel.writeLong(((java.lang.Long) k().orElse(0L)).longValue());
    }

    public final boolean x(java.lang.String str) {
        return (i().containsKey(str) || h().containsKey(str) || g().containsKey(str)) ? false : true;
    }

    public final void y(java.lang.String str) {
        ahvr.ci(str);
        u(uyb.b(str));
    }

    public final void z(int i) {
        akzx akzxVarM = defpackage.jxb.b.m();
        akzxVarM.u();
        defpackage.jxb jxbVar = (defpackage.jxb) akzxVarM.b;
        jxbVar.d = i - 1;
        jxbVar.c |= 1;
        r((defpackage.jxb) akzxVarM.p());
    }
}
