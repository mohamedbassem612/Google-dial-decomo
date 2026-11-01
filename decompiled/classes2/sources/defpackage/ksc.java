package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksc {
    public final boolean a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ksc) && this.a == ((defpackage.ksc) obj).a;
    }

    public final int hashCode() {
        return anty.L(this.a);
    }

    public final java.lang.String toString() {
        return "GoogleCalendarResult(isEventAddedToCalendar=" + this.a + ')';
    }
}
