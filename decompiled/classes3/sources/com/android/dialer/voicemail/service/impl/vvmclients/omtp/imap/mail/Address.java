package com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class Address implements android.os.Parcelable {
    public java.lang.String c;
    private java.lang.String g;
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("^<?([^>]+)>?$");
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("^\"?([^\"]*)\"?$");
    private static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("\\\\([\\\\\"])");
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("\\A[^@]+@([[\\w][\\d]\\-\\(\\)\\[\\]]+\\.)+[[\\w][\\d]\\-\\(\\)\\[\\]]+\\z");
    public static final com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[] b = new com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[0];
    public static final android.os.Parcelable.Creator CREATOR = new gec(16);

    public Address(android.os.Parcel parcel) {
        b(parcel.readString());
        a(parcel.readString());
    }

    public final void a(java.lang.String str) {
        this.c = d.matcher(str).replaceAll("$1");
    }

    public final void b(java.lang.String str) {
        if (str != null) {
            str = aprs.a(f.matcher(e.matcher(str).replaceAll("$1")).replaceAll("$1"), aprr.a);
            if (str.length() == 0) {
                str = null;
            }
        }
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address ? this.c.equals(((com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address) obj).c) : super.equals(obj);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.g;
        if (str == null || str.equals(this.c)) {
            return this.c;
        }
        boolean zMatches = str.matches(".*[\\(\\)<>@,;:\\\\\".\\[\\]].*");
        java.lang.String str2 = this.g;
        if (!zMatches) {
            return str2 + " <" + this.c + '>';
        }
        if (str2 == null) {
            str2 = null;
        } else if (!str2.matches("^\".*\"$")) {
            str2 = "\"" + str2 + '\"';
        }
        return str2 + " <" + this.c + '>';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.g);
        parcel.writeString(this.c);
    }

    public Address(java.lang.String str, java.lang.String str2) {
        b(str2);
        a(str);
    }
}
