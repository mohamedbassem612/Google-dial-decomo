package com.android.dialer.contactchecker.receiver.impl.service.db;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ContactCheckerCallLogDatabase_Impl extends com.android.dialer.contactchecker.receiver.impl.service.db.ContactCheckerCallLogDatabase {
    private volatile lsx m;
    private volatile ltd n;

    protected final gfn a() {
        return new gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), new java.lang.String[]{"contact_checker_call_log_data", "contact_check_spoof_call_log_data"});
    }

    protected final /* synthetic */ ggb c() {
        return new defpackage.lsw(this);
    }

    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(lsx.class, java.util.Collections.EMPTY_LIST);
        map.put(ltd.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    public final java.util.List v() {
        return new java.util.ArrayList();
    }

    public final lsx x() {
        lsx lsxVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.ltb(this);
            }
            lsxVar = this.m;
        }
        return lsxVar;
    }

    public final ltd y() {
        ltd ltdVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new defpackage.lti(this);
            }
            ltdVar = this.n;
        }
        return ltdVar;
    }
}
