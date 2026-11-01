package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class epj extends defpackage.epi {
    public final java.lang.String[] c;
    public final java.lang.String d;
    public final java.lang.String[] e;
    public final java.lang.String f;
    private final defpackage.epk o;
    private final android.net.Uri p;
    private android.database.Cursor q;
    private android.os.CancellationSignal r;

    public epj(android.content.Context context, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        super(context);
        this.o = new defpackage.epk(this);
        this.p = uri;
        this.c = strArr;
        this.d = str;
        this.e = strArr2;
        this.f = str2;
    }

    @Override // defpackage.epi
    public final void b() {
        synchronized (this) {
            android.os.CancellationSignal cancellationSignal = this.r;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    @Override // defpackage.epi, defpackage.epl
    @java.lang.Deprecated
    public final void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.d(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(java.util.Arrays.toString(this.c));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.d);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(java.util.Arrays.toString(this.e));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.q);
    }

    @Override // defpackage.epi
    public final /* bridge */ /* synthetic */ void f(java.lang.Object obj) {
        android.database.Cursor cursor = (android.database.Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // defpackage.epi
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public android.database.Cursor a() {
        synchronized (this) {
            if (this.b != null) {
                throw new defpackage.dxg();
            }
            this.r = new android.os.CancellationSignal();
        }
        try {
            try {
                android.database.Cursor cursorQuery = this.h.getContentResolver().query(this.p, this.c, this.d, this.e, this.f, this.r);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.getCount();
                        cursorQuery.registerContentObserver(this.o);
                    } catch (java.lang.RuntimeException e) {
                        cursorQuery.close();
                        throw e;
                    }
                }
                synchronized (this) {
                    this.r = null;
                }
                return cursorQuery;
            } catch (java.lang.Exception e2) {
                if (e2 instanceof android.os.OperationCanceledException) {
                    throw new defpackage.dxg();
                }
                throw e2;
            }
        } catch (java.lang.Throwable th) {
            synchronized (this) {
                this.r = null;
                throw th;
            }
        }
    }

    @Override // defpackage.epl
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void k(android.database.Cursor cursor) {
        if (this.k) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        android.database.Cursor cursor2 = this.q;
        this.q = cursor;
        if (this.i) {
            super.k(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // defpackage.epl
    protected final void l() {
        h();
        android.database.Cursor cursor = this.q;
        if (cursor != null && !cursor.isClosed()) {
            this.q.close();
        }
        this.q = null;
    }

    @Override // defpackage.epl
    public final void m() {
        android.database.Cursor cursor = this.q;
        if (cursor != null) {
            k(cursor);
        }
        boolean z = this.l;
        this.l = false;
        this.m |= z;
        if (z || this.q == null) {
            g();
        }
    }

    @Override // defpackage.epl
    public final void n() {
        h();
    }
}
